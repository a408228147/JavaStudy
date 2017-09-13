package unsynch;
/*
* 同步 线程 测试程序；
* 模拟若干账户 随机转移一定的钱到另一个账户
*
*
* */
public class UnsynchBankTest {
    public static  final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static  final int DELAY = 10;
    public static void main (String[] args)
    {
             Bank bank = new Bank(NACCOUNTS ,INITIAL_BALANCE);
             for (int i = 0; i<NACCOUNTS; i++)
             {
                 int fromAccount  = i;
                 Runnable r = () ->{
                     try {
                         while(true)
                         {
                             int toAccount  = (int) (bank.size()*Math.random());
                             double amount =  MAX_AMOUNT* Math.random();
                             bank.transfer(fromAccount,toAccount,amount);
                             Thread.sleep((int)(DELAY*Math.random()));
                         }
                     }catch (InterruptedException e)
                     {}
                 };
                 Thread t = new Thread(r);
                 t.start();
             }
    }
}
