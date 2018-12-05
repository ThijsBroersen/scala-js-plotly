package nl.thijsbroersen.plotly.js

import org.scalajs.dom.html.Div
import org.scalajs.dom.raw
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }
import scala.scalajs.js.{ Promise, | }

@js.native
trait GraphDiv extends Div {
  def on[T <: Event](`type`: String, fn: js.Function1[T, Unit]): Unit = js.native
  val data: js.Array[js.Dictionary[Any]] = js.native
  val layout: js.Dictionary[Any] = js.native
}

@js.native
@JSGlobal("Plotly")
object Plotly extends js.Object {
  def newPlot(gd: String | HTMLElement, data: js.UndefOr[js.Array[js.Dictionary[Any]]] = js.undefined, layout: js.UndefOr[js.Dictionary[Any]] = js.undefined,
    options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Promise[GraphDiv] = js.native
  def plot(gd: String | HTMLElement, data: js.UndefOr[js.Array[js.Dictionary[Any]]] = js.undefined, layout: js.UndefOr[js.Dictionary[Any]] = js.undefined,
    options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Promise[GraphDiv] = js.native
  def restyle(gd: String | HTMLElement, astr: js.Dictionary[Any],
    traces: js.UndefOr[Int | js.Array[Int]] = js.undefined): Promise[GraphDiv] = js.native
  def relayout(gd: String | GraphDiv, astr: js.Dictionary[Any]): Promise[GraphDiv] = js.native
  def redraw(gd: String | GraphDiv): Promise[GraphDiv] = js.native
  def update(gd: String | GraphDiv, traceUpdate: js.UndefOr[js.Dictionary[Any]] = js.undefined,
    layoutUpdate: js.UndefOr[js.Dictionary[Any]] = js.undefined,
    traces: js.UndefOr[Int | js.Array[Int]] = js.undefined): Promise[GraphDiv] = js.native
  def addTraces(gd: String | GraphDiv, traces: js.UndefOr[Int | js.Array[Int]] = js.undefined,
    newIndices: js.UndefOr[Int | js.Array[Int]] = js.undefined): Promise[GraphDiv] = js.native
  def deleteTraces(gd: String | GraphDiv, indices: Int | js.Array[Int]): Promise[GraphDiv] = js.native
  def moveTraces(gd: String | GraphDiv, currentIndices: Int | js.Array[Int],
    newIndices: js.UndefOr[Int | js.Array[Int]] = js.undefined): Promise[GraphDiv] = js.native
  def extendTraces(gd: String | GraphDiv, update: Int | js.Array[Int], indices: Int | js.Array[Int] /*, maxPoints*/ ): Promise[GraphDiv] = js.native
  def prependTraces(gd: String | GraphDiv, update: Int | js.Array[Int], indices: Int | js.Array[Int] /*, maxPoints*/ ): Promise[GraphDiv] = js.native
  def purge(gd: String | GraphDiv): GraphDiv = js.native
  def toImage(gd: String | GraphDiv, opts: js.Dictionary[Any]): Promise[String] = js.native
  def downloadImage(gd: String | GraphDiv, opts: js.Dictionary[Any]): Promise[_] = js.native
  def animate(gd: String | GraphDiv, update: js.Object, options: js.Object): Unit = js.native

  @js.native
  @JSName("Plots")
  object Plots extends js.Object {
    def resize(gd: String | GraphDiv): Promise[GraphDiv] = js.native
  }

  //  @js.native
  //  @JSName("d3")
  val d3 = org.singlespaced.d3js.d3

}

//@js.native
//trait PlotlyOptions extends js.Object {
//  val scrollZoom: Boolean = js.native
//  val editable: Boolean = js.native
//  val staticPlot: Boolean = js.native
//  val displayModeBar: Boolean = js.native
//  val linkText: String = js.native
//  val showLink: Boolean = js.native
//  val displaylogo: Boolean = js.native
//}
//
//object PlotlyOptions {
//  def apply(
//    scrollZoom: js.UndefOr[Boolean] = js.undefined,
//    editable: js.UndefOr[Boolean] = js.undefined,
//    staticPlot: js.UndefOr[Boolean] = js.undefined,
//    displayModeBar: js.UndefOr[Boolean] = js.undefined,
//    linkText: js.UndefOr[String] = js.undefined,
//    showLink: js.UndefOr[Boolean] = js.undefined,
//    displaylogo: js.UndefOr[Boolean] = js.undefined
//  ): PlotlyOptions = {
//    OptionsUtil.strip(
//      js.Dynamic.literal(
//      scrollZoom = scrollZoom,
//      editable = editable,
//      staticPlot = staticPlot,
//      displayModeBar = displayModeBar,
//      linkText = linkText,
//      showLink = showLink,
//      displaylogo = displaylogo
//    ).asInstanceOf[js.Dictionary[js.Any]]
//    ).asInstanceOf[PlotlyOptions]
//  }
//}

//@js.native
//trait ToImageOptions extends js.Object {
//  val format: String = js.native
//  val filename: String = js.native
//}

//object ToImageOptions {
//  def apply(
//    format: js.UndefOr[String] = js.undefined
//  ): ToImageOptions = {
//    OptionsUtil.strip(
//      js.Dynamic.literal(format = format).asInstanceOf[js.Dictionary[js.Any]]
//    ).asInstanceOf[ToImageOptions]
//  }
//}

//@js.native
//trait DlImageOptions extends js.Object {
//  val format: String = js.native
//  val filename: String = js.native
//}
//
//object DlImageOptions {
//  def apply(
//    format: js.UndefOr[String] = js.undefined,
//    filename: js.UndefOr[String] = js.undefined
//  ): DlImageOptions = {
//    OptionsUtil.strip(
//      js.Dynamic.literal(format = format, filename = filename).asInstanceOf[js.Dictionary[js.Any]]
//    ).asInstanceOf[DlImageOptions]
//  }
//}
