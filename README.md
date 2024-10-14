# HerbSeek
HerbSeek - App that shows nearby sightings of herbs to end users and allows them to publish their own sightings for other users to view.

This app is an **IN-PROGRESS** implemention using the following technologies:

Database = PostgreSQL 17

Front-end = Javascript + React + MUI components

Back-end (Database API) = Java + Spring Boot

Third party APIs = Google Maps

FOLDER STRUCTURE:

herbseek folder contains front-end Javascript + React project

demo folder contains back-end database API Java + Spring Boot project



**Instructions on how to run:**

1. Provide Google Maps API key and Map ID to getGoogleMapsAPIKey() and getGoogleMapsMapId() functions in herbseek/UtilsFunctions.js.
2. Create a new database and seed some demo records using the datarepo_postgres_seed.sql file located in the root HerbSeek folder.
3. Provide DB connection information (URL, username, password) in demo/application.properties.
4. Run npm install to install the front-end dependencies.
5. Make sure the database is online and has data seeded.
6. Start both the front-end and back-end projects using the IDE of your choice. 


**TODOs:**

1. Modify CSS to improve design of the front-end.
2. Reorganize components for better visibility.
3. Include more detail for each herb sighting.
