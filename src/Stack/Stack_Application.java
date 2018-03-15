package Stack;

import java.util.Stack;

public class Stack_Application {
    public static void main(String[] args) {
        String s = "[()]{}{[()[]()]()}";
        // System.out.println(isComplete(s));
        Stack_Application x = new Stack_Application();
        String a = x.conver2Postfix("1+2*(3+4)+5*(6+7)");
        System.out.println(a);
    }
    /**
     * @Describe_栈的经典应用 判断括号是否匹配完整
     */
    public static boolean isComplete(String s) {
        Stack<String> left = new Stack<String>();
        while (!s.isEmpty()) {
            //取字符串首位
            String character = s.substring(0, 1);
            //去剩余字母
            s = s.substring(1);
            //是左括号入栈
            if (character.equals("(") || character.equals("{") || character.equals("[")) {
                left.push(character);
            }//如果是右括号
            else if (character.equals(")") || character.equals("}") || character.equals("]")) {
                //首先判断栈是否为空
                if (left.empty()) {
                    return false;
                }
                //如果不为空则弹出进行匹配
                String leftchar = left.pop();
                //检查左右括号是否匹配
                if (character.equals(")")) {
                    if (!leftchar.equals("("))
                        return false;
                } else if (character.equals("}")) {
                    if (!leftchar.equals("{"))
                        return false;
                } else if (character.equals("]")) {
                    if (!leftchar.equals("["))
                        return false;
                }
            }
        }
        return left.empty();
    }

    /**
     * @Describe_栈的经典应用求表达式的值
     */
    public String conver2Postfix(String s) {
        //先把中缀表达式转化为后缀表达式
        Stack character = new Stack();//运算符栈
        String postFix = "";// 后缀表达式
        for (int i = 0; s != null && i < s.length(); i++) {
            char c = s.charAt(i);
            if (' ' != c) {
                if (isopenbrackets(c))//左括号
                {
                    character.push(c);
                } else if (isclosebrackets((c)))//右括号
                {
                    Character ac = (Character) character.pop();
                    while (!isopenbrackets(ac)) {
                        postFix += ac.toString();
                        ac = (Character) character.pop();// 如果取出的是左括号，很显然就丢弃了
                    }
                } else if (isOperator(c))//操作符
                {
                    if (!character.isEmpty()) { // 如果栈非空，则需要判断
                        Character ac = (Character) character.peek();//栈内操作符
                        if (ac!=null&&priority(c)==priority(ac)){
                            postFix +=ac;
                            character.pop();
                            character.push(c);
                        }else if (ac!=null&&priority(c)>priority(ac))
                        {
                            character.push(c);
                        }else if (ac!=null&&priority(c)<=priority(ac)) {
                            while (!character.isEmpty())
                            {
                                Character a = (Character)   character.pop();
                                postFix+=a;
                            }
                            character.push(c);
                        }
                    }else {
                        character.push(c);
                    }} else {// 操作数，直接添加到后缀表达式 中
                    postFix += c;
                }
            }
        }
while(!character.isEmpty())
{
    postFix+=character.pop().toString();
}
        return postFix;
    }

    /**
     * @Describe_是否为左括号
     */
    public boolean isopenbrackets(char s) {
        if (s == '(') {
            return true;
        } else if (s == '[') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Describe_是否为右括号
     */
    public boolean isclosebrackets(char s) {
        if (s == ')') {
            return true;
        } else if (s == ']') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Describe_是否为操作符
     */
    public boolean isOperator(char s) {
        if ('+' == s || '-' == s || '*' == s || '/' == s || '^' == s || '%' == s) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Describe_求运算符的优先级
     */
    private int priority(char c) {
        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }



}

