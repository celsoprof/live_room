package br.com.fiap.estoque

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.estoque.ui.theme.EstoqueTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      EstoqueTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

        }
      }
    }
  }
}

@Composable
fun CadastroScreen() {

  Column(
    modifier = Modifier.padding(16.dp)
  ) {
    Text(
      text = "Cadastro de produtos",
      fontSize = 24.sp,
      fontWeight = FontWeight.Bold,
      modifier = Modifier.padding(bottom = 8.dp)
    )
    OutlinedTextField(
      value = "",
      onValueChange = {},
      label = { Text(text = "Nome do produto") },
      modifier = Modifier.fillMaxWidth()
    )
    OutlinedTextField(
      value = "",
      onValueChange = {},
      label = { Text(text = "Quantidade em estoque") },
      modifier = Modifier.fillMaxWidth()
    )
    OutlinedTextField(
      value = "",
      onValueChange = {},
      label = { Text(text = "Data de vencimento") },
      modifier = Modifier.fillMaxWidth()
    )
    Row(
      verticalAlignment = Alignment.CenterVertically
    ) {
      Checkbox(checked = false, onCheckedChange = {})
      Text(text = "Disponível")
    }
    Button(
      onClick = { /*TODO*/ },
      modifier = Modifier.fillMaxWidth()
    ) {
      Text(text = "Salvar")
    }
  }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroScreenPreview() {
  EstoqueTheme {
    CadastroScreen()
  }
}