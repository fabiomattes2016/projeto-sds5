import NavBar from "./Components/NavBar";
import DataTable from "./Components/DataTable";
import Footer from "./Components/Footer";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1>Olá mundo</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
