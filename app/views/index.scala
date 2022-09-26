package views
import scalatags.Text.all._

object index {
  def main() = html(
    head(
      link(href:="/assets/stylesheets/main.css", rel:="stylesheet")(),
      tag("title")("Scalatags testing")
    ),
    body(
      p("Hello world!")
    )
  )
}
