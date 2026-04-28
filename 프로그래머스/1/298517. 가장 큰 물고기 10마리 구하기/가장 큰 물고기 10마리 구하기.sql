-- 코드를 작성해주세요
SELECT A.ID
     , A.LENGTH
  FROM (
        SELECT AA.ID
             , AA.LENGTH
             , ROW_NUMBER() OVER(ORDER BY AA.LENGTH DESC, AA.ID ASC) AS RNUM
          FROM FISH_INFO AA
       ) A
 WHERE A.RNUM <= 10; 
