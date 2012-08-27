package ${package}

import android.os.Bundle
import android.app.Activity
import android.view.Menu

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override def onCreateOptionsMenu(menu: Menu) = {
    getMenuInflater().inflate(R.menu.activity_main, menu)
    true
  }
}
