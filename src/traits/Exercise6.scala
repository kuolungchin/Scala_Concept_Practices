package traits

import java.awt._

/*
 * From the diagram, JContainer needs both JComponent and Container.
 * So that we need to make Container as a trait.
 */

class Component
class JComponent extends Component
trait Container extends Component
class JContainer extends JComponent with Container