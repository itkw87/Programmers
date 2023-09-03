-- 자동차 종류가 '트럭'인 자동차의 대여 기록에 대해서 대여 기록 별로 대여 금액(컬럼명:FEE)을 구하여 대여 기록 ID와 대여 금액 리스트를 출력하는 SQL을 작성해라!
-- 단, 결과는 대여 금액을 기준으로 내림차순 정렬, 대여금액이 같으면 기록ID를 기준으로 내림차순 정렬해라!
SELECT HISTORY_ID
      , TRUNCATE(
        CASE WHEN P.DISCOUNT_RATE IS NULL 
             THEN C.DAILY_FEE * (DATEDIFF(H.END_DATE, H.START_DATE) + 1)                   
        ELSE (C.DAILY_FEE - (C.DAILY_FEE * (P.DISCOUNT_RATE / 100))) * (DATEDIFF(H.END_DATE, H.START_DATE) + 1)           
        END
        , 0) AS FEE 
FROM CAR_RENTAL_COMPANY_CAR C
     INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
        ON C.CAR_ID = H.CAR_ID
     LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
    ON C.CAR_TYPE = P.CAR_TYPE
    AND P.DURATION_TYPE LIKE 
                            CASE WHEN DATEDIFF(H.END_DATE, H.START_DATE) + 1 BETWEEN 7 AND 29
                                      THEN '%7일%'
                                 WHEN DATEDIFF(H.END_DATE, H.START_DATE) + 1 BETWEEN 30 AND 89
                                      THEN '%30일%'
                                 WHEN DATEDIFF(H.END_DATE, H.START_DATE) + 1 >= 90
                                      THEN '%90일%'
                            END
WHERE C.CAR_TYPE = '트럭'
ORDER BY FEE DESC, HISTORY_ID DESC;