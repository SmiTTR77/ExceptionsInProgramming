# **HomeWork Exceptions in programming:**
## **HomeWork 1:**
Для решения данного домашнего задания вам необходимо воспользоваться сервисом автоматической проверки написанного кода.
Для того, чтобы успешно выполнить задание, необходимо перейти по каждой из представленных ссылок и решить все предложенные задачи. 
Будьте внимательны, количество попыток отправки кода на проверку ограничено! Вам дано 5 попыток на каждую задачу.
Прикреплять полученные решения не требуется. Итоговая оценка домашнего задания появится автоматически на платформе после решения всех задач. 
Полученная оценка не повлияет на получение итогового документа об обучении.

[Задача 1](https://autotest.gb.ru/problems/12?lesson_id=344085&_ga=2.55732398.46097132.1691071993-2971630038.1688170138 "Задача 1")

[Задача 2](https://autotest.gb.ru/problems/7?lesson_id=344085&_ga=2.9079728.46097132.1691071993-2971630038.1688170138 "Задача 2")

[Задача 3](https://autotest.gb.ru/problems/8?lesson_id=344085&_ga=2.9079728.46097132.1691071993-2971630038.1688170138 "Задача 3")

## **HomeWork 2:**
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. 
2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
3. Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

## **HomeWork 3:**
1. Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
      
       Фамилия Имя Отчество датарождения номертелефона пол

       Форматы данных:
       фамилия, имя, отчество - строки
       датарождения - строка формата dd.mm.yyyy
       номертелефона - целое беззнаковое число без форматирования
       пол - символ латиницей f или m.

2. Приложение должно проверить введенные данные по количеству. 
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
что он ввел меньше и больше данных, чем требуется.


3. Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 
Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, 
пользователю выведено сообщение с информацией, что именно неверно.


4. Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
в него в одну строку должны записаться полученные данные, вида

       <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

   Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

   Не забудьте закрыть соединение с файлом.


5. При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

**Данная промежуточная аттестация оценивается по системе "зачет" / "не зачет"**

"Зачет" ставится, если слушатель успешно выполнил
"Незачет"" ставится, если слушатель НЕуспешно выполнил

Критерии оценивания:
Слушатель напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом