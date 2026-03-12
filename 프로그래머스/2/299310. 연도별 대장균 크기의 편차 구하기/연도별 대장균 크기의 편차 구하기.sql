  SELECT A.YEAR                        AS YEAR
       , A.MAX_SIZE - A.SIZE_OF_COLONY AS YEAR_DEV
       , A.ID
    FROM (
           SELECT AA.ID
                , AA.SIZE_OF_COLONY
                , YEAR(AA.DIFFERENTIATION_DATE)                                         AS YEAR
                , MAX(AA.SIZE_OF_COLONY) OVER (PARTITION BY YEAR(DIFFERENTIATION_DATE)) AS MAX_SIZE
             FROM ECOLI_DATA AA
         ) A
ORDER BY YEAR, YEAR_DEV