class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   byte days_defaulted[]= {11,12,13,14,15};
   
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
   float amount_per_day= 2000f;
   float amount_debtor_paid= 50000f;

  // declare all the variables needed for your calculations
  float total_amount=0f;
  byte actual_element= 0;
  float temp=amount_debtor_paid;
  byte days_debtor_paid=0;
  float left_to_pay;
  float extra;
  
  // calculate and print total amount the debtor is to pay using for each loop
  for(byte i: days_defaulted){
    total_amount+=amount_per_day;
    actual_element++;
  }
  System.out.println("The number of the elements in the array is"+actual_element);

  System.out.println("The total amount the debtor is to pay is #"+ total_amount);

   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day.

   for(int i=0; i<actual_element; i++){
     if(temp>=amount_per_day){
       temp= temp-amount_per_day;
     }
     else if(temp<amount_per_day){
       break;
     }
   } 

   for(int i=0; i<days_debtor_paid;i++){
     System.out.println("The debtor paid for day" + days_defaulted[i]);
   }

   if(amount_debtor_paid%amount_per_day>0 &&amount_debtor_paid<total_amount)
   {
     System.out.println("The day that was not completely paid for is day:" + days_defaulted[days_debtor_paid]);
   }
     
   {System.out.println("The amount left to complete the payment for day" + days_defaulted[days_debtor_paid]+"is #" +(amount_per_day-(amount_debtor_paid%amount_per_day)));
   }

   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if(amount_debtor_paid<total_amount){
     left_to_pay=
     total_amount-amount_debtor_paid;
     System.out.println("The amount that is left to pay is #" + left_to_pay);
   }
   else if(amount_debtor_paid>total_amount){
     extra=amount_debtor_paid-total_amount;
     System.out.println("The amount you are being owed is: #" + extra);
   }
   else if(amount_debtor_paid==total_amount)
   {
     System.out.println("You have paid the exact amount!");
     }

   //kindly remove the statement below when you are done with the assignment
  
  }
}