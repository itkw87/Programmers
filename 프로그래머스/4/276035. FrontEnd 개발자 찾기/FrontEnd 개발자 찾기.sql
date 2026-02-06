SELECT A.ID
     , A.EMAIL
     , A.FIRST_NAME
     , A.LAST_NAME
  FROM DEVELOPERS A
 WHERE EXISTS (
                SELECT 1
                  FROM SKILLCODES
                 WHERE CATEGORY LIKE 'Front End%'
                   AND CODE & A.SKILL_CODE
              )
 ORDER BY A.ID