SELECT A.GRADE
     , A.ID
     , A.EMAIL
  FROM (
        SELECT CASE WHEN (   
                             AA.SKILL_CODE & (SELECT SUM(AAA.CODE) FROM SKILLCODES AAA WHERE AAA.CATEGORY = 'Front End')
                         AND AA.SKILL_CODE & (SELECT     AAA.CODE  FROM SKILLCODES AAA WHERE AAA.NAME     = 'Python')
                         )                                                                                                THEN 'A'
                    WHEN     AA.SKILL_CODE & (SELECT     AAA.CODE  FROM SKILLCODES AAA WHERE AAA.NAME     = 'C#')         THEN 'B'
                    WHEN     AA.SKILL_CODE & (SELECT SUM(AAA.CODE) FROM SKILLCODES AAA WHERE AAA.CATEGORY = 'Front End')  THEN 'C'
                END AS GRADE
             , AA.ID
             , AA.EMAIL
          FROM DEVELOPERS AA  
       ) A
 WHERE A.GRADE IS NOT NULL
 ORDER BY A.GRADE, A.ID
       

  
  