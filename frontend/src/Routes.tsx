import { BrowserRouter, Switch, Route } from "react-router-dom";

import Dashboard from "./Pages/Dashboard";
import Home from "./Pages/Home";

function Routes() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/dashboard" exact component={Dashboard} />
      </Switch>
    </BrowserRouter>
  );
}

export default Routes;
