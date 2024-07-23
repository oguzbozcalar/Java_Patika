-- ODEV-9  --

SELECT city.city, country.country FROM city
INNER JOIN country ON city.country_id = country.country_id;

SELECT customer.first_name, customer.last_name, payment.amount FROM payment
INNer JOIN customer ON payment.customer_id = customer.customer_id;

SELECT customer.first_name, customer.last_name, rental.rental_id FROM rental
INNER JOIN customer ON rental.customer_id = customer.customer_id;
