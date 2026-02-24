    SELECT B.ID
         , C.FISH_NAME
         , B.LENGTH
      FROM (
            SELECT FISH_TYPE
                 , MAX(LENGTH) AS MAX_LEN
              FROM FISH_INFO
          GROUP BY FISH_TYPE
           ) A
INNER JOIN FISH_INFO B
        ON A.FISH_TYPE = B.FISH_TYPE
       AND A.MAX_LEN   = B.LENGTH
INNER JOIN FISH_NAME_INFO C
        ON B.FISH_TYPE = C.FISH_TYPE
  ORDER BY B.ID