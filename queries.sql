--Part 1
SELECT
    COLUMN_NAME, DATA_TYPE
FROM
    INFORMATION_SCHEMA.COLUMNS
WHERE
    TABLE_NAME = 'job';
--Part 2
SELECT
    name
FROM
    employer
WHERE
    location = "St. Louis City";
--Part 3

--Part 4
