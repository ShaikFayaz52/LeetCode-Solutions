SELECT DISTINCT  actor_id,director_id FROM ActorDirector
GROUP BY actor_id,DIRECTOR_ID
HAVING
COUNT(ACTOR_ID)>=3;