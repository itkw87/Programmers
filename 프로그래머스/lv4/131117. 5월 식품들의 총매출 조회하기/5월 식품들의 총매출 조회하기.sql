-- 생산일자가 2022년 5월인 식품들의 식품ID, 식품 이름, 총매출을 조회하는 SQL문을 작성하고 결과는 총매출을 기준으로 내림차순하라
-- 단, 총 매출이 같다면 식품 ID를 기준으로 오름 차순하라.
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(P.PRICE * O.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT P
     INNER JOIN FOOD_ORDER O
                  ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE YEAR(O.PRODUCE_DATE) = '2022' 
      AND MONTH(O.PRODUCE_DATE) = '05'
GROUP BY P.PRODUCT_ID
ORDER BY SUM(P.PRICE * O.AMOUNT) DESC, P.PRODUCT_ID ASC;