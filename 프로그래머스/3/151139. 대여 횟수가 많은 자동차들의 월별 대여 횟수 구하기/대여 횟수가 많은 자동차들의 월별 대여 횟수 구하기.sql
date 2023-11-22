-- 코드를 입력하세요
select month(start_date), car_id, count(car_id) records
from car_rental_company_rental_history
where car_id in (
                SELECT car_id
                from car_rental_company_rental_history
                where start_date between '2022-08-01' and '2022-10-31'
                group by 1
                having count(car_id) >= 5
                )
and start_date between '2022-08-01' and '2022-10-31'
group by 1, 2
order by 1, 2 desc