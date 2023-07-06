-----------------------
|       User          |
-----------------------
| - userType: UserType |
| - yearsOfService: int|
-----------------------
| + User(userType: UserType, yearsOfService: int)
| + getUserType(): UserType
| + getYearsOfService(): int
-----------------------

-----------------------
|        Bill         |
-----------------------
| - totalAmount: double|
| - items: List<String>|
-----------------------
| + Bill(totalAmount: double, items: List<String>)
| + getTotalAmount(): double
| + getItems(): List<String>
-----------------------

-----------------------
| DiscountCalculator  |
-----------------------
| - PERCENTAGE_DISCOUNT_GOLD_CARD: double
| - PERCENTAGE_DISCOUNT_SILVER_CARD: double
| - PERCENTAGE_DISCOUNT_AFFILIATE: double
| - PERCENTAGE_DISCOUNT_YEARS_OF_SERVICE: double
| - AMOUNT_DISCOUNT_THRESHOLD: double
| - AMOUNT_DISCOUNT_VALUE: double
| - PHONE_ITEM: String
-----------------------
| + calculateNetPayableAmount(user: User, bill: Bill): double
-----------------------

-----------------------
|    StoreDiscounts   |
-----------------------
| + main(args: String[]): void
-----------------------
