package examplesFromLectures.strings;


import org.apache.commons.lang.StringUtils;

public class StringRun {
    public void run(){

        //основні методи класу string:

        //_______________________________________

        String s = " "; //пуста строка

        //Чим відрізняються два метода?
        System.out.println("Empty = " + s.isEmpty()); // рахує пробіли. Враховує будь-які символи
        System.out.println("Blank = " + s.isBlank()); // не рахує пробіли і схожі символи

        //________________________________________

        //Функція - чи є щось в строкі?

        s = "test"; // Як зрозуміти, чи є в цій строці символ s?
        System.out.println("s = " + s.indexOf("t")); // перевіряємо на наявність цього сиволу, перебираємо строку

        // метод IndexOf перебирає строку
        // могло б також виглядати так:
        if(s.indexOf("t") >= 0){
            System.out.println("s = " + s);
        }

        //аналог indexOf - метод contains
        if(s.contains("a")){
            System.out.println("s = " + s);
        }

        //__________________________________________

        // Якщо нам потрібно розбити строку по словам, використовують split

        s = "test aaaa";
        String [] strings = s.split(" "); // сортує по пробілам
        System.out.println("strings = " + strings.length); // виведе, скільки у нас слів

        //__________________________________________

        //Щоб замінити один символ на інший, використовують replace
        String rep = s.replace('t', 'i');
        System.out.println("rep = " + rep);

        //_________________________________________

        // Коли потрібно вирізати якусь підстроку в строкі використовують substring
        String sub = s.substring(3); // вирізати від індекса 3
        System.out.println("sub = " + sub);

        // Також, можливо вказати явно, вирізати з .. до ..
        sub = s.substring(3, 6);
        System.out.println("sub = " + sub);

        //___________________________________________

        //Метод, який обрізає пробіли trim
        String email = "      test@gmail.com   ";
        email = email.trim();
        System.out.println("email = " + email);

        //__________________________________________

        //Метод, який змінює регістр toUpperCase та toLowerCase
        System.out.println("email = " + email.toUpperCase());
        System.out.println("email = " + email.toLowerCase());

        //__________________________________________

        //Якщо потрібно перевірити, що строка не Blank
        //бібліотека commons-lang (встановлюється в dependency)
        //Метод StringUtils.isNotBlank - це зручніше, ніж !isBlank()

        //__________________________________________

        //є класи StringBilder та StringBuffer, коли маніпуляції з однією і тією ж строкою, то краще
        //
        //_________________________________________

        // Є функція startsWith

        System.out.println("email = " + email.startsWith("te")); // повертає true/false

        //________________________________________

        //Щоб згенерувати запрос SQL, наприклад, якщо не знаємо, які прийдуть запроси з User
        //Якщо нам необхідно створити якусь query, можемо зробити так через клас String (1):

        User user = new User();
        user.setEmail("email");
        String query = "select * from users where ";
        if (StringUtils.isNotBlank(user.getEmail())){
            query = query.concat(" email like %" + user.getEmail() + "%");
        }
        if (StringUtils.isNotBlank(user.getFirstName())){
            query = query.concat(" firstName like %" + user.getFirstName() + "%");
        }
        System.out.println("query = " + query);

        //Або так (2)
        //Щоб не було мусору в пулі строк, щоб примустити жити строку в HEAP, викор StringBuilder
        //Різниця між верхнім і нижнім:
        //Зверху ми кожного разу створюємо нову строку, замусорюючи пул строк
        //Знизу (в StringBuilder) ми кожного разу модифікуємо один і той же об'єкт
        //Де потрібно робити операції з однією і тією ж строкою, краще використовувати StringBuilder або
        //StringBuffer - останный в багатопоточному

        StringBuilder queryBuilder = new StringBuilder("select * from users");
        if (StringUtils.isNotBlank(user.getEmail())){
            queryBuilder = queryBuilder.append(" email like %" + user.getEmail() + "%");
        }
        if (StringUtils.isNotBlank(user.getFirstName())){
            queryBuilder = queryBuilder.append(" firstName like %" + user.getFirstName() + "%");
        }
        System.out.println("queryBuilder = " + queryBuilder.toString());

        //_______________________________________

        // У StringBuilder корисний метод reverse, який перевертає строку з кінця на початок

        StringBuilder reverse = new StringBuilder("qwert");
        System.out.println("reverse = " + reverse.reverse());

        //_____________________________________

        //Регулярні вирази
        //Хочемо прибрати літери та залишити тільки числа, наприклад
        String numbers = "shjsjd7783n3j223nd";
        String repl = numbers.replaceAll("[^0-9]", "");
        System.out.println("repl = " + repl);


    }
}
