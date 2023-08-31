-- 오프라인 판매 테이블은 동일 날짜, 회원ID, 상품ID 조합에 대해서는 하나의 판매 데이터만 존재!
-- 온라인 판매 테이블은 동일한 날짜, 상품ID 조합에 대해서 하나의 판매 데이터만 존재!
-- 두 테이블에서 2022년 3월의 오프라인/온라인 상품 판매 데이터의 판매 날짜, 상품ID, 유저ID, 판매량을 출력하라!
-- 단, 오프라인 판매 테이블의 USER_ID는 NULL로 하라!
-- *정렬 1. 판매일 기준으로 오름차순 2.상품ID를 기준으로 오름차순 3.유저ID를 기준으로 오름차순 정렬하라!

(SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE 
WHERE DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-03'

UNION
 
SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE 
WHERE DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-03'
)
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;