export class Contact {
    fullName!: String;
    email!: String;
    phoneNo!: Number;
    message!: String;
    datetime!: String;

    setFullName(val: String){
        this.fullName = val
    }
    setEmail(val: String){
        this.email = val
    }
    setPhoneNo(val: Number){
        this.phoneNo = val
    }
    setMessage(val: String){
        this.message = val
    }
    setDateTime(){
        //format ddmmyyyy-hhmmss
        let date: Date = new Date();
        this.fullName = "" + date.getUTCDay() + date.getUTCMonth() + date.getFullYear() + "-" +
                        date.getUTCHours() + date.getUTCMinutes() + date.getUTCSeconds();
    }

    getDateTime() : String{
        return this.datetime;
    }
}
