-- 코드를 작성해주세요
SELECT A.ID
     , A.EMAIL
     , A.FIRST_NAME
     , A.LAST_NAME
  FROM DEVELOPERS A
 WHERE A.SKILL_CODE & (
                        SELECT SUM(AA.CODE)
                          FROM SKILLCODES AA
                         WHERE NAME IN ('Python', 'C#')
                      )
 ORDER BY A.ID                        
  
     