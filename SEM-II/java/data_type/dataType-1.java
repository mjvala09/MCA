class DataTypeList{
    public static void main(String[] args){
        var b = true;
        var i = 500;
        var f = 3.14f;
        var d = 3.14;
        var str = "Uttam Dhameshiya";
        var c = 'A';
        System.out.println(((Object)b).getClass().getSimpleName());
        System.out.println(((Object)i).getClass().getSimpleName());
        System.out.println(((Object)f).getClass().getSimpleName());
        System.out.println(((Object)d).getClass().getSimpleName());
        System.out.println(((Object)str).getClass().getSimpleName());
        System.out.println(((Object)c).getClass().getSimpleName());
    }
}