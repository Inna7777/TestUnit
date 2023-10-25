# Задание1
Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям 
добавлять, редактировать и удалять контакты. Ваша задача - придумать как можно больше различных тестов
(юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста,
его тип и краткое описание того, что этот тест проверяет.

# 1. Юнит тесты

### "testaddContact" 
   *  Проверяем, что контакт был успешно добавлен\
      assertTrue(contacts.contains(newContact));

   * Проверяем, что список контактов увеличился на 1\
      assertEquals(1, contacts.size());

   * Проверяем, что добавленный контакт имеет корректные данные\
     assertEquals("Masha", addContact.getFirstName());
     assertEquals("Dolgova", addContact.getLastName());
   
### "testeditContact"  
   *  Проверяем, что контакт был успешно отредактирован в списке\
     assertFalse(contacts.contains(contact));\
     assertTrue(contacts.contains(editedContact));

   * Проверяем, что список контактов остался тем же по размеру\
    assertEquals(1, contacts.size());

### "testdeleteContact" 
  * Проверяем,  что удаленный контакт больше не находится в списке контактов\
   assertFalse(contactList.contacts.contains(contact1));\
   * Проверяем что количество контактов в списке уменьшилось на 1\
    assertEquals(1, contactList.contacts.size());


   
# 2. Интеграционные тесты
* Проверяем инициализацию системы: создание экземпляров классов .
### "testSystemInitialization"\
   assertNotNull(notepad)
   assertNotNull(contact)



* Проверяем несколько контактов и добавление их в Notepad.
### testnotepad.addContact(contact1);\
   assertEquals(2, notepad.getContacts().size());


* Проверяем, что контакты были успешно добавлены в Notepad.\
    assertTrue(notepad.getContacts().contains(contact1));
    
* Проверка удаления выбранного контакта из Notepad.\
    assertEquals(0, notepad.getContacts().size());\



# 3. Сквозные тесты
### "testAddContactButton (сквозной тест)"\
* Проверяем функциональность кнопки добавления контакта.
  assertTrue(ui.isAddContactFormOpen());

###  "testDeleteContactButton()"
* Проверяе, что контакт успешно удален
assertFalse(ui.isContactAdded("Masha Gromova"));

### "public void testAddContactValidation() {
 Проверяем, что появились сообщения об ошибках валидации в имени , фамилии и mail.
assertTrue(ui.isFirstNameErrorDisplayed());
assertTrue(ui.isLastNameErrorDisplayed());
assertTrue(ui.isEmailErrorDisplayed());"

  
    

# Задание 2.

1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
   -Это юнит-тест, так как проверяется работа отдельной функции addContact,
а не ее взаимодействие с другими компонентами системы.\


2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в 
списке контактов.
   -Это интеграционный тест, так как проверяется взаимодействие нескольких компонентов системы: 
пользовательского интерфейса и списка контактов.\


3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.
  - Это сквозной тест, т.к. он охватывает полный цикл взаимодействия пользователя с  записной книжкой.