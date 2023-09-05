package kr.hs.emirim.kye.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            var Array = arrayOf("고은성", "김성철", "서경수")
            var checkArray = booleanArrayOf(false, true, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 뮤배는?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(Array, checkArray){
                dialog, index, isChecked ->
                btn.text = Array[index];
            }
            dlg.setNegativeButton("닫기",null)
            dlg.show()
        }
    }
}