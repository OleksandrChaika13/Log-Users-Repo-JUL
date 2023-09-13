
-- Створення БД
CREATE DATABASE users_db;

-- Запит на створення таблиці
CREATE TABLE IF NOT EXISTS users (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL,
  phone TEXT NOT NULL,
  email TEXT NOT NULL
)

-- Створення юзеру
INSERT INTO users (name, phone, email) VALUES(?, ?, ?)

-- Вибір юзеру з таблиці
SELECT * FROM users

-- Читання юзерів
SELECT id, name, phone, email FROM users

-- Оновлення всіх даних юзера
UPDATE users SET name = ?, phone = ?, email = ? WHERE id = ?

-- Оновлення лише імені
UPDATE users SET name = ? WHERE id = ?

-- Оновлення лише телефону
UPDATE users SET phone = ? WHERE id = ?

-- Оновлення лише email
UPDATE users SET email = ? WHERE id = ?

-- Видалення юзеру
DELETE FROM users WHERE id = ?