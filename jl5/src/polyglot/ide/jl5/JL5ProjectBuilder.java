package polyglot.ide.jl5;

import polyglot.ide.JLProjectBuilder;
import polyglot.ide.PluginInfo;

public class JL5ProjectBuilder extends JLProjectBuilder {
	public JL5ProjectBuilder() {
	  this(JL5PluginInfo.INSTANCE);
	}
	
	public JL5ProjectBuilder(PluginInfo pluginInfo) {
	  super(pluginInfo);
	}
}
