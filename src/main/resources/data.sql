INSERT INTO m_user (user_id,
                    user_name,
                    password,
                    confirm_password,
                    dob,
                    age,
                    gender,
                    department_id,
                    role)
VALUES ('admin@gmail.com', 'admin', 'Admin@123', 'Admin@123', '1994-01-01', 30, 1, 1, 'ROLE_ADMIN'),
       ('user@gmail.com', 'user', 'User@123', 'User@123', '1994-01-01', 30, 1, 1, 'ROLE_USER');

INSERT INTO m_department (department_id,
                          department_name)
VALUES (1, 'Development'),
       (2, 'Testing')
;

INSERT INTO t_salary (user_id,
                      `year_month`,
                      salary)
VALUES ('admin@gmail.com', '01/2020', 10000),
       ('admin@gmail.com', '02/2020', 20000);