package views
import scalatags.Text.all._

object index {
  def main() = html(
    head(
      tag("title")("Scalatags testing")
    ),
    body(
      p("Hello world!")
    )
  )
}
