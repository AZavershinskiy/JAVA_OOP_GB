package Sem5.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Sem5.model.User;

public class Validation {

    Pattern namePattern = Pattern.compile("^\\S+$");
    Pattern phonePattern = Pattern.compile("^((8|\\+7)[\\-]?)?(\\(?\\d{3}\\)?[\\-]?)?[\\d\\-]{7,10}$");

    public void validateUser(User inpiutUser) throws Exception {
        Matcher firstNameMatcher = namePattern.matcher(inpiutUser.getFirstName());
        Matcher lastNameMatcher = namePattern.matcher(inpiutUser.getLastName());
        Matcher phoneMatcher = phonePattern.matcher(inpiutUser.getPhone());
        if (!firstNameMatcher.find()) {
            throw new Exception("Имя должно быть без пробелов");
        }
        if (!lastNameMatcher.find()) {
            throw new Exception("Фамилия должна быть без пробелов");
        }
        if (!phoneMatcher.find()) {
            throw new Exception("Недопустимый номер телефона");
        }
    }
}
