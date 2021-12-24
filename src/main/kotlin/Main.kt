fun main() {
    val contacts = listOf(
        Contact.PhoneNumber("3923923293", PhoneType.PERSONAL),
        Contact.Email("sdvdsv@mail.ru"),
        Contact.Messenger("@48160044", "Alex")
    )
    val user1 = Users("Klava", "Bravo", 25, contacts)

    val contacts2 = listOf(
        Contact.PhoneNumber("09876535432", PhoneType.WORK),
        Contact.Email("skjgkgdhsht@mail.ru"),
        Contact.Messenger("@48165534", "Alkhgc")
    )
    val user2 = Users("Klava.bmv", "Bravocxgdghc", 22, contacts2)

    val contacts3 = listOf(
        Contact.PhoneNumber("39239kjbjhvhg93", PhoneType.HOME),
        Contact.Email("sdvdsv@l;jkbjh"),
        Contact.Messenger("@4816004mnvhgxg4", "Alehjggfxx")
    )
    val user3 = Users("Klava", "Bravo", 20, contacts3);

    val useres10: List<Users> = listOf(user1, user2, user3)

    println(useres10)
}




