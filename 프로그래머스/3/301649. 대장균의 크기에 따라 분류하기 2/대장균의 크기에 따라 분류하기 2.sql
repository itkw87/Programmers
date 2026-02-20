WITH RANKED_DATA AS (
    SELECT ID
     , RANK() OVER(ORDER BY SIZE_OF_COLONY DESC) AS RANK_NUM
     , COUNT(*) OVER() AS TOTAL_COUNT
  FROM ECOLI_DATA
 ORDER BY SIZE_OF_COLONY DESC
)
SELECT ID
     , CASE WHEN (RANK_NUM / TOTAL_COUNT) * 100 <= 25  THEN 'CRITICAL'
            WHEN (RANK_NUM / TOTAL_COUNT) * 100 <= 50  THEN 'HIGH' 
            WHEN (RANK_NUM / TOTAL_COUNT) * 100 <= 75  THEN 'MEDIUM'
            ELSE                                            'LOW'
        END                                                             AS COLONY_NAME
  FROM RANKED_DATA
 ORDER BY ID
