CREATE SEQUENCE S_STUDENT_GROUP_ID START WITH 1 INCREMENT BY 1;
CREATE TABLE T_STUDENT_GROUPS(
    STUDENT_GROUP_ID NUMERIC(10,0),
    STUDENT_GROUP_COURSE VARCHAR(100),
    STUDENT_GROUP_SEMESTER NUMERIC(1,0)
);