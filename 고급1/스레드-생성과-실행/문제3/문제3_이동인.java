/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	   Runnable runnable = new Runnable() {
    	    @Override
    	    public void run() {
    	        for (int i=1;i<=5;i++){
    	            System.out.println(Thread.currentThread().getName()+"-> value:"+i);
    	        }
    	        try {
    	            Thread.sleep(1000);
    	        } catch (InterruptedException e){
    	            throw new RuntimeException(e);
    	        }
    	    }
	    };
		Thread thread = new Thread(runnable,"doin-second-thread");
		thread.start();
	}
	
}