package entelijan.viz

object VizMultidiagramTryout extends App {

  private val dir = DefaultDirectories("viz-tryout")

  implicit val creator: VizCreator[Viz.XY] = VizCreators.gnuplot(scriptDir= dir.scriptDir, imageDir = dir.imageDir, clazz=classOf[Viz.XY])

  val yr = Some(Viz.Range(Some(0), Some(5)))

  val multiDiagram = Viz.MultiDiagram[Viz.XY](
    "vizMultidiagramTryout01",
    2,
    title = Some("Multidiagram 01"),
    diagrams = Seq(
      Viz.Diagram[Viz.XY](
        "a",
        "Diagram A",
        yRange = yr,
        dataRows = Seq(
          Viz.DataRow[Viz.XY](
            data = Seq(
              Viz.XY(1, 2),
              Viz.XY(2, 1),
              Viz.XY(3, 1),
              Viz.XY(4, 2),
            )
          ),
          Viz.DataRow[Viz.XY](
            data = Seq(
              Viz.XY(1, 3),
              Viz.XY(2, 2),
              Viz.XY(3, 3),
              Viz.XY(4, 2),
            )
          ),
        )
      ),
      Viz.Diagram[Viz.XY](
        "b",
        "Diagram B",
        yRange = yr,
        dataRows = Seq(
          Viz.DataRow[Viz.XY](
            data = Seq(
              Viz.XY(1, 1),
              Viz.XY(2, 1.1),
              Viz.XY(3, 1.2),
              Viz.XY(4, 1.4),
            )
          ),
          Viz.DataRow[Viz.XY](
            data = Seq(
              Viz.XY(1, 3),
              Viz.XY(2, 1),
              Viz.XY(3, 1),
              Viz.XY(4, 2),
            )
          ),
        )
      ),
      Viz.Diagram[Viz.XY](
        "c",
        "Diagram C",
        yRange = yr,
        dataRows = Seq(
          Viz.DataRow[Viz.XY](
            data = Seq(
              Viz.XY(1, 1),
              Viz.XY(2, 1.1),
              Viz.XY(3, 1.4),
              Viz.XY(4, 1.8),
            )
          ),
          Viz.DataRow[Viz.XY](
            data = Seq(
              Viz.XY(1, 2),
              Viz.XY(2, 3),
              Viz.XY(3, 2),
              Viz.XY(4, 2.1),
            )
          ),
        )
      ),
    )
  )

  Viz.createDiagram(multiDiagram)

}
