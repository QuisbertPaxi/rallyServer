package v1._5_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import v1._2_DTO.ConcursoDTO;
import v1._4_Service.Interface.ConcursoService;

@Controller
@RequestMapping("/concurso")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ConcursoController {

    @Autowired
    ConcursoService concursoService;

    @PutMapping("/Update/{idAdmin}")
    public ResponseEntity<Object> actualizarConcurso (@PathVariable Long idAdmin, @RequestBody ConcursoDTO act) {
        return concursoService.editConcurso(idAdmin, act);
    }
    @GetMapping
    public ResponseEntity<Object> obtenerConcurso () {
        ConcursoDTO concurso = concursoService.getConcurso();
        return ResponseEntity.ok(concurso);
    }
}