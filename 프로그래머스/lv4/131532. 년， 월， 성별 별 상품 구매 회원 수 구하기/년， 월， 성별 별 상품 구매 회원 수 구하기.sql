-- USER_INFO 테이블과 ONLINE_SALE 테이블에서 년, 월, 성별로 상품을 구매한 회원수를 집계하는 SQL문을 작성하시오.
-- 단, 결과는 년, 월, 성별을 기준으로 오름차순 정렬해라. *성별 정보가 없는 경우 결과에서 제외하라!
SELECT YEAR(O.SALES_DATE) AS YEAR, MONTH(O.SALES_DATE) AS MONTH, U.GENDER , COUNT(DISTINCT(U.USER_ID))
FROM USER_INFO U
     INNER JOIN ONLINE_SALE O  
     ON U.USER_ID = O.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY YEAR(O.SALES_DATE), MONTH(O.SALES_DATE), U.GENDER
ORDER BY YEAR(O.SALES_DATE), MONTH(O.SALES_DATE), U.GENDER;

