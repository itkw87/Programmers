SELECT A.CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM BOOK A 
     INNER JOIN BOOK_SALES  B 
            ON A.BOOK_ID = B.BOOK_ID 
WHERE YEAR(SALES_DATE) = 2022 AND MONTH(SALES_DATE) = 1
GROUP BY CATEGORY
ORDER BY CATEGORY;