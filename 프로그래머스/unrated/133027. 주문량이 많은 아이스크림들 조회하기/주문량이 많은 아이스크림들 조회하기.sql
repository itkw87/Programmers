-- 7월 아이스크림 총 주문량과 상반기 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL문을 작성하라!

SELECT A.FLAVOR
FROM FIRST_HALF A
INNER JOIN (SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_ORDER
            FROM JULY 
            GROUP BY FLAVOR) B 
      ON A.FLAVOR = B.FLAVOR
ORDER BY (A.TOTAL_ORDER + B.TOTAL_ORDER) DESC
LIMIT 3;