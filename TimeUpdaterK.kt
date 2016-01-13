import java.awt.List
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.text.SimpleDateFormat
import java.util.Date
import kotlin.text.Regex

/**
 * Created by JohnTsai on 16/1/13.
 */
class TimeUpdaterK{
     //变量
     private var _fileName:String = ""
     private var _dateString:String= ""

     //常量
    private val formatDateString:String = "yyyy-MM-dd kk:mm"
    private val regexString:String = "[0-9]{4}-[0-9]{2}-[0-9]{2}\\s[0-9]{2}-[0-9]{2}"

    //函数声明与实现
    fun getDateString(date:Date):String{
        var sdf:SimpleDateFormat =  SimpleDateFormat(formatDateString)
        return sdf.format(date)
    }

    //构造方法
    constructor(fileName:String){
        _fileName = fileName
        val date:Date = Date()
        _dateString = getDateString(date)
    }

    private  fun read():String{
        val file:File = File(_fileName)
        val path:Path = file.toPath()
        var str:String = ""

        try {
            str = String(Files.readAllBytes(path))
        }catch(e:IOException){
            e.printStackTrace()
        }
        return str
    }

    private fun write(string:String) {
        val data: ByteArray = string.toByteArray()
        try {
            val fos: FileOutputStream = FileOutputStream(_fileName)
            fos.write(data)
            fos.close()
        }catch(e:Exception){
            e.printStackTrace()
        }
    }

    fun update(){
        val string:String = read()
        val updateString = string.replace("[0-9]{4}-[0-9]{2}-[0-9]{2}\\s[0-9]{2}:[0-9]{2}".toRegex(),_dateString)
        write(updateString)
    }
}

