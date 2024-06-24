CREATE TABLE IF NOT EXISTS m_user (
    user_id VARCHAR(50) PRIMARY KEY,
    user_name VARCHAR(50),
    password VARCHAR(20),
    confirm_password VARCHAR(20),
    date_of_birth DATE,
    age INT,
    gender INT,
    department_id INT,
    role VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS m_department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS t_salary (
    user_id VARCHAR(50),
    `year_month` VARCHAR(50),
    salary INT,
    PRIMARY KEY (user_id, `year_month`)
);