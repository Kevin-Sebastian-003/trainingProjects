export class Contact {
    fullName!: String;
    email!: String;
    phoneNo!: Number;
    message!: String;
    datetime!: String;

    setDateTime(){
        //format ddmmyyyy-hhmmss
        let date: Date = new Date();
        this.fullName = "" + date.getUTCDay() + date.getUTCMonth() + date.getFullYear() + "-" +
                        date.getUTCHours() + date.getUTCMinutes() + date.getUTCSeconds();
    }
}
