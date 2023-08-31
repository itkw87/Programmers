-- 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회하시오. 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력되도록 하라!
-- 단, 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬 하라!
SELECT A1.MEMBER_NAME, B1.REVIEW_TEXT, DATE_FORMAT(B1.REVIEW_DATE, '%Y-%m-%d')
FROM MEMBER_PROFILE A1
     INNER JOIN REST_REVIEW B1
     ON A1.MEMBER_ID = B1.MEMBER_ID
WHERE A1.MEMBER_ID = (SELECT MEMBER_ID
                      FROM REST_REVIEW 
                      GROUP BY MEMBER_ID
                      ORDER BY COUNT(MEMBER_ID) DESC
                      LIMIT 1)

ORDER BY B1.REVIEW_DATE, B1.REVIEW_TEXT;