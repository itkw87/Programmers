SELECT X.SCORE
     , X.EMP_NO
     , X.EMP_NAME
     , X.POSITION
     , X.EMAIL
FROM (
       SELECT SUM(B.SCORE) AS SCORE
            , A.EMP_NO
            , A.EMP_NAME
            , A.POSITION
            , A.EMAIL
            , RANK() OVER (ORDER BY SUM(B.SCORE) DESC) AS RANK_NUM
         FROM HR_EMPLOYEES A
   INNER JOIN HR_GRADE     B
           ON A.EMP_NO = B.EMP_NO    
     GROUP BY A.EMP_NO, A.EMP_NAME, A.POSITION, A.EMAIL
     ) X
WHERE X.RANK_NUM = 1;



  