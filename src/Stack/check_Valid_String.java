package Stack;

import java.util.Stack;

public class check_Valid_String {
    public boolean checkValidString(String s) {

        int max = 0;
        int min = 0;
        for (char ch : s.toCharArray()) {
            if ( ch == '('){
                max += 1;
                min += 1;
            }

            if (ch == ')'){
                max -= 1;
                min -= 1;
            }

            if (ch == '*'){
                max += 1;
                min -= 1;
            }

            if (max < 0)
                return false;

            min = Math.max(max, 0);
        }
        if (min == 0)
            return true;
            return false;

        }

}
