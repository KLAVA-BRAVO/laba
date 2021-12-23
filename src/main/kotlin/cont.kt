sealed class Contact {
    data class PhoneNumber(val number: String, val phoneType: PhoneType) : Contact()
    data class Email(val email: String) : Contact()
    data class Messenger(val id: String, val name: String) : Contact()

}