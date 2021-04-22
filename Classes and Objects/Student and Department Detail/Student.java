public class Student {
    private int sid;
    private String sname;
    private Department department;
    public void setSid(int sid) {
        this.sid=sid;
    }
    public int getSid(){
        return sid;
    }
    public void setSname(String sname) {
        this.sname=sname;
    }
    public String getSname() {
        return sname;
    }
    public void setDepartment(Department department){
        this.department=department;
    }
    public Department getDepartment(){
        return department;
    }
}