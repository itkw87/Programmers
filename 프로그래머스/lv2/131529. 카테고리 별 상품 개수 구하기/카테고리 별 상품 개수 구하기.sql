SELECT LEFT(PRODUCT_CODE, 2) AS CATEGORY, COUNT(1) AS PRODUCTS
FROM PRODUCT
GROUP BY LEFT(PRODUCT_CODE, 2);