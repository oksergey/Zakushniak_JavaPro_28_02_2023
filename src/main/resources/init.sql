CREATE
DATABASE homework16;

CREATE TABLE homework
(
    homework_id SERIAL PRIMARY KEY,
    name        VARCHAR(30),
    description TEXT
);

CREATE TABLE lesson
(
    lesson_id   SERIAL PRIMARY KEY,
    name        VARCHAR(30),
    updatedAt   DATE,
    homework_id INT
);

ALTER TABLE lesson
    ADD CONSTRAINT fk_homework_for_lesson
        FOREIGN KEY (homework_id)
            REFERENCES homework (homework_id);

CREATE TABLE schedule
(
    schedule_id SERIAL PRIMARY KEY,
    name        VARCHAR(30),
    updatedAt   DATE,
    lesson_id   INT
);


CREATE TABLE schedule_lessons_relation
(
    schedule_id INT,
    lesson_id   INT,
    PRIMARY KEY (schedule_id, lesson_id)
)